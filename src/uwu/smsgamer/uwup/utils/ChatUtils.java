package uwu.smsgamer.uwup.utils;

public class ChatUtils {
	public static String colorize(String msg) {
		String fmsg = msg;
		fmsg = fmsg.replaceAll("&&", "_=-fa");
		fmsg = fmsg.replaceAll("&", "�");
		fmsg = fmsg.replaceAll("_=-fa", "&");
		return fmsg;
	}

	public static String phReplace(String msg, String p, String r, int vl) {
		String fmsg = msg;
		fmsg = fmsg.replaceAll("%player%", p);
		fmsg = fmsg.replaceAll("%reason%", r);
		fmsg = fmsg.replaceAll("%vl%", vl + "");
		return fmsg;
	}
}