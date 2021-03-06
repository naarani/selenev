package org.naarani.ecantonchiro.ssh;

import java.io.IOException;

public class MaskerStreamLog extends DefaultStreamLog {

	static public String pwdMask = "#[pwd-masked]#";
	
	protected SshServerManager svr;
	
	public MaskerStreamLog(){}

	public MaskerStreamLog( SshServerManager svr, boolean error, boolean echo ){
		super( error, echo );
		this.svr = svr;
	}

	@Override
	public void write( byte[] buffer, int start, int len ) throws IOException {
		String msg = new String( buffer, start, len, "UTF8" );
		if( svr.getPwd() != null )
			msg = msg.replace( svr.getPwd(), pwdMask );
//		if( msg.compareToIgnoreCase( pwdMask + "\r\n" ) == 0 )
//			return;
		writeMsg( msg );
	}
	
}