package hudson.plugins.android_emulator;

import hudson.model.Action;
import hudson.model.AbstractBuild;

import java.util.logging.Logger;

public class Logcat implements Action {
	private AbstractBuild<?, ?> build;

	private final static Logger Log = Logger.getLogger(Logcat.class.getName());

	public Logcat(AbstractBuild<?, ?> build) {
		this.build = build;
	}

	public String getUrlName() {
		return "logcat";
	}

	public String getIconFileName() {
		return "folder.png";
	}

	public String getDisplayName() {
		return "View Logcat";
	}

	/**
	 * @return The build that constructed this action
	 */
	public AbstractBuild<?, ?> getBuild() {
		Log.info("getBuild called");
		return build;
	}
}
