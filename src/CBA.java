
public class CBA {
	
	@Override
	public void initObjectsUsingComCli() {
		cbaBackupHandler = Cbafactory.cbaBackupHandler(nodeConfiguraion, backupTraceDirectory);
		cbaSoftwaremanagementHandler = CbaFactory.cbaSoftwareManagementHandler(nodeConfiguration, backupTraceDirectory);
		final ComCliData comCliData = CbaFactory.createComCliDataWithTraceDir(nodeConfiguration, TestInfo.getLogDir());
		comCli = new MtasComCliImpl(comCliData);
		cbaCMComCliHandler = new CbaCMComCliHandler(comCli);
		cbaQueryPurgeSubscriberDataHandler = new CbaQueryPurgeSubscriberDataHandler(this);
		cbaGracefulForcefulShutdownHandler = new CbaGracefulForcefulShutdownHandler(this);
	}

}
