package de.dfki.cos.basys.platform.runtime.communication.provider;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.platform.model.runtime.communication.Channel;
import de.dfki.cos.basys.platform.model.runtime.communication.ChannelPool;
import de.dfki.cos.basys.platform.model.runtime.communication.Client;
import de.dfki.cos.basys.platform.model.runtime.communication.Notification;
import de.dfki.cos.basys.platform.model.runtime.communication.Request;
import de.dfki.cos.basys.platform.model.runtime.communication.Response;
import de.dfki.cos.basys.platform.runtime.communication.CommFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class KafkaCommunicationProviderTest {
	protected final Logger LOGGER = LoggerFactory.getLogger(KafkaCommunicationProvider.class);

	// String brokerUri = "vm://localhost?broker.persistent=false";
	String brokerUri = null;

	CommFactory fac = CommFactory.getInstance();

	Client client_1, client_2;
	ChannelPool cp_11, cp_12, cp_21, cp_22;


	@Before
	public void setUp() throws Exception {
		LOGGER.info("setUp");

		client_1 = fac.createClient("client_1", null);
		client_2 = fac.createClient("client_2", null);

		cp_11 = fac.connectChannelPool(client_1, brokerUri, new KafkaCommunicationProvider());
		cp_12 = fac.connectChannelPool(client_1, brokerUri, new KafkaCommunicationProvider());
		cp_21 = fac.connectChannelPool(client_2, brokerUri, new KafkaCommunicationProvider());
		cp_22 = fac.connectChannelPool(client_2, brokerUri, new KafkaCommunicationProvider());
	}

	@After
	public void tearDown() throws Exception {
		LOGGER.info("tearDown");
	
		client_1.disconnect();
		client_2.disconnect();
		

		//printClassPath();
	}

	@Test
	public void testConnectDisconnect() {
		LOGGER.info("testConnectDisconnect");

		assertTrue(cp_11.isConnected());
		assertTrue(cp_12.isConnected());
		assertTrue(client_1.isConnected());

		assertTrue(cp_21.isConnected());
		assertTrue(cp_22.isConnected());
		assertTrue(client_2.isConnected());

		client_1.disconnect();
		assertFalse(cp_11.isConnected());
		assertFalse(cp_12.isConnected());
		assertFalse(client_1.isConnected());

		cp_21.disconnect();
		assertFalse(cp_21.isConnected());
		assertTrue(cp_22.isConnected());
		assertFalse(client_2.isConnected());

		cp_22.disconnect();
		assertFalse(cp_22.isConnected());
		assertFalse(cp_22.isConnected());
		assertFalse(client_2.isConnected());
	}

	@Test
	public void testSubscribeUnsubscribe() {
		LOGGER.info("testSubscribeUnsubscribe");
//
		Channel ch_11_1 = fac.openChannel(cp_11, "channel_11_1", false, new TestChannelListener());
		Channel ch_11_2 = fac.openChannel(cp_11, "channel_11_2", false, new TestChannelListener());
		Channel ch_12_1 = fac.openChannel(cp_12, "channel_12_1", false, new TestChannelListener());
		Channel ch_12_2 = fac.openChannel(cp_12, "channel_12_2", false, new TestChannelListener());
		Channel ch_21_1 = fac.openChannel(cp_21, "channel_21_1", false, new TestChannelListener());
		Channel ch_21_2 = fac.openChannel(cp_21, "channel_21_2", false, new TestChannelListener());
		Channel ch_22_1 = fac.openChannel(cp_22, "channel_22_1", false, new TestChannelListener());
		Channel ch_22_2 = fac.openChannel(cp_22, "channel_22_2", false, new TestChannelListener());

		assertTrue(ch_11_1.isOpen());
		assertTrue(ch_11_2.isOpen());
		assertTrue(ch_12_1.isOpen());
		assertTrue(ch_12_2.isOpen());
		assertTrue(ch_21_1.isOpen());
		assertTrue(ch_21_2.isOpen());
		assertTrue(ch_22_1.isOpen());
		assertTrue(ch_22_2.isOpen());

		client_1.disconnect();
		assertFalse(ch_11_1.isOpen());
		assertFalse(ch_11_2.isOpen());
		assertFalse(ch_12_1.isOpen());
		assertFalse(ch_12_2.isOpen());
		assertTrue(ch_21_1.isOpen());
		assertTrue(ch_21_2.isOpen());
		assertTrue(ch_22_1.isOpen());
		assertTrue(ch_22_2.isOpen());

		cp_21.disconnect();
		assertFalse(ch_11_1.isOpen());
		assertFalse(ch_11_2.isOpen());
		assertFalse(ch_12_1.isOpen());
		assertFalse(ch_12_2.isOpen());
		assertFalse(ch_21_1.isOpen());
		assertFalse(ch_21_2.isOpen());
		assertTrue(ch_22_1.isOpen());
		assertTrue(ch_22_2.isOpen());

		ch_22_1.close();
		assertFalse(ch_11_1.isOpen());
		assertFalse(ch_11_2.isOpen());
		assertFalse(ch_12_1.isOpen());
		assertFalse(ch_12_2.isOpen());
		assertFalse(ch_21_1.isOpen());
		assertFalse(ch_21_2.isOpen());
		assertFalse(ch_22_1.isOpen());
		assertTrue(ch_22_2.isOpen());
		
		ch_22_2.close();
		
		assertFalse(ch_11_1.isOpen());
		assertFalse(ch_11_2.isOpen());
		assertFalse(ch_12_1.isOpen());
		assertFalse(ch_12_2.isOpen());
		assertFalse(ch_21_1.isOpen());
		assertFalse(ch_21_2.isOpen());
		assertFalse(ch_22_1.isOpen());
		assertFalse(ch_22_2.isOpen());
		
	}
	
	protected void printClassPath() {
		ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        System.out.println("####################################################");
        System.out.println("");
        for(URL url: urls){
        	System.out.println(url.getFile());
        }
        System.out.println("");
        System.out.println("####################################################");
	}
	
	@Test
	@Ignore
	public void testSendMessage() {
		LOGGER.info("testSendMessage");
		
		String message = "this is a test message!";
		String prefix = UUID.randomUUID().toString();

		TestChannelListener tester_1 = new TestChannelListener(message);
		TestChannelListener tester_2 = new TestChannelListener(message);

		Channel ch_1_sender = fac.openChannel(cp_11, prefix + "#channel_1", false, null);
		// Channel ch_2_sender = fac.openChannel(cp_21, "channel_2", false, null);

		Channel ch_1_receiver = fac.openChannel(cp_21, prefix + "#channel_1", false, tester_1);
		// Channel ch_2_receiver = fac.openChannel(cp_21, "channel_2", false, tester_2);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ch_1_sender.sendMessage(message);

		assertTrue(tester_1.isSuccess());
		// assertTrue(tester_2.isSuccess());
	}

	@Test
	public void testSendNotification() {
		LOGGER.info("testSendNotification");

		String message = "this is a test message!";
		String prefix = UUID.randomUUID().toString();

		TestChannelListener tester_1 = new TestChannelListener(message);
		TestChannelListener tester_2 = new TestChannelListener(message);

		Channel ch_1_sender = fac.openChannel(cp_11, prefix + "#channel_1", false, null);
		// Channel ch_2_sender = fac.openChannel(cp_21, "channel_2", false, null);

		Channel ch_1_receiver_1 = fac.openChannel(cp_21, prefix + "#channel_1", false, tester_1);
		Channel ch_1_receiver_2 = fac.openChannel(cp_21, prefix + "#channel_1", false, tester_2);
		// Channel ch_2_receiver = fac.openChannel(cp_21, "channel_2", false, tester_2);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Notification not = fac.createNotification(message);		
		ch_1_sender.sendNotification(not);

		assertTrue(tester_1.isSuccess());
		assertTrue(tester_2.isSuccess());
	}
	
	@Test
	public void testSendRequestSync() {
		LOGGER.info("testSendRequestSync");

		String message = "this is a test message!";
		String prefix = UUID.randomUUID().toString();

		TestChannelListener tester_1 = new TestChannelListener(message);
		TestChannelListener tester_2 = new TestChannelListener(message);

		Channel ch_1_sender = fac.openChannel(cp_11, prefix + "#channel_1", false, null);
		// Channel ch_2_sender = fac.openChannel(cp_21, "channel_2", false, null);

		Channel ch_1_receiver = fac.openChannel(cp_21, prefix + "#channel_1", false, tester_1);
		// Channel ch_2_receiver = fac.openChannel(cp_21, "channel_2", false, tester_2);

		Request req = fac.createRequest(message);

		Response res = ch_1_sender.sendRequest(req);

		assertTrue(tester_1.isSuccess());
		assertTrue(res.getPayload().equals(message.toUpperCase()));
	}

}
