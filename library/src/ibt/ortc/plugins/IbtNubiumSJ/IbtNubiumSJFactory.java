/**
 * 
 */
package ibt.ortc.plugins.IbtNubiumSJ;

import ibt.ortc.extensibility.OrtcClient;
import ibt.ortc.extensibility.OrtcFactory;

public class IbtNubiumSJFactory implements OrtcFactory {

	/* (non-Javadoc)
	 * @see ibt.ortc.android.extensibility.OrtcFactory#createClient()
	 */
	@Override
	public OrtcClient createClient() {
		// TODO Auto-generated method stub
		return new IbtNubiumSJClient();
	}

}
