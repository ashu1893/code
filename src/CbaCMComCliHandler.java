
public class CbaCMComCliHandler {
	
	public String getMtasVersion() {
		try {
			comCli.open();
			final String mtasVersion = comCli.send(MTAS_VERSION);
			return mtasVersion.replace("MtasFunctionVersion=", "").replace("\"", "").replace("mtasFunctionVersion=","");
			
		}catch(TimeoutException | IOException | NullPointerException e) {
			LOGGER.error("Problem rerieving mtas version ",e);
			return "---";
		}finally {
			comCli.close();
		}
	}
	
	public boolean sendCMCommand(final String command) {
		boolean result = false;
		try {
			comCli.open();
			comCli.send("configure");
			comCli.send(command);
			comCli.send("commit");
			result = true;
		}catch(TimeoutException | IOException e) {
			LOGGER.error("Problem configuring the node when sending CM CLI command: "+ command + " + ", e);
		}finally {
			comCli.close();
		}
		return result;
	}
	
	public boolean enableMprof() {
		LOGGER.info("Enable Mprof (memory profiling)");
		return sendCMCommand(ENABLE_MPROF);
	}
	
	public MtasFunctionAdministrativeState getValueOfMtasFunctionAdministrativeState() throws TimeoutException, IOException{
		try {
			comCli.open();
			return getValueOfMtasFunctionAdministrativestate();
		}catch(TimeoutException | IOException e) {
			LOGGER.error("Error happened while setting mtasFunctionAdminstrativeState", e);
			return MtasFunctionAdminstrativeState.UNKNOWN;
		}finally {
			comCli.close();
		}
	}
	

}
