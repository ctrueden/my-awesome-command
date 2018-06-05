/*
 * To the extent possible under law, the ImageJ developers have waived
 * all copyright and related or neighboring rights to this tutorial code.
 *
 * See the CC0 1.0 Universal license for details:
 *     http://creativecommons.org/publicdomain/zero/1.0/
 */

package net.restlesscoder.awesome;

import net.imagej.ImageJ;
import net.imagej.ops.OpService;

import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;
import org.scijava.ui.UIService;

/**
 * My awesome first ImageJ command.
 */
@Plugin(type = Command.class, menuPath = "Plugins>My Awesome Command")
public class AwesomeCommand implements Command {

	@Parameter
	private UIService uiService;

	@Parameter
	private OpService opService;

	@Override
	public void run() {
		uiService.showDialog("Hello");
	}

	/**
	 * This main function serves for development purposes. It allows you to run the
	 * plugin immediately out of your integrated development environment (IDE).
	 *
	 * @param args
	 *            whatever, it's ignored
	 * @throws Exception
	 */
	public static void main(final String... args) throws Exception {
		// create the ImageJ application context with all available services
		final ImageJ ij = new ImageJ();
		ij.ui().showUI();

		// invoke the plugin
		ij.command().run(AwesomeCommand.class, true);
	}

}
