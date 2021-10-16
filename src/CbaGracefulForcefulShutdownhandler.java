import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class CbaGracefulForcefulShutdownhandler {
	
	private static final String SHOW_COMMAND = "show -v ";
	private final Comcli comCli;
	
	private boolean isLocked(final String baseMessage) {
		final String checkMessage = SHOW_COMMAND + baseMessage;
		try {
			final String response = comCli.send(checkMessage);
			LOGGER.info("Is "+ baseMessage + " LOCKED: " + response.contains("LOCKED"));
			return response.contains("LOCKED");
		}catch(TimeoutException | IOException e) {
			AssertApi.skip("Exception occured, during shutting down vmtas service. Probably wrong service name was given: "+ e);
			return false;
		}
	}
	
	public static void collectFilesFromNode(final String sourcepath, final String sourceHost, final RemoteSession session, final String destinationPath, final boolean acceptFileNotFound, final String userName,final String password ) {
		LOGGER.debug("Collect files from node");
		final String destinationPathFinal = ensureDirectoryExist(destinationPath);
		final SftpgetWithPasswordCmd sftp = new SftpgetWithPasswordCmd(username, sourceHost, sourcePath.replace("*","\\*"), destinationPathFinal, "-r", new Password(password), CUSTOM_COMMAND_TIMEOUT, acceptFileNotFound);
		session.send(sftp);
	}

}
