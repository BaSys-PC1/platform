package de.dfki.iui.basys.runtime.unit.packml;

public interface CommandInterface {
	
	void setMode(Mode mode);
	
	void setConfig(UnitConfiguration config);
	
	void reset();
	void start();
	void stop();
	void hold();
	void unhold();
	void suspend();
	void unsuspend();
	void abort();
	void clear();
}
