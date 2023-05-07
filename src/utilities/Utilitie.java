package utilities;

public class Utilitie {

	public static String deleteInvalidChar(String textWritteUser) {
		textWritteUser = textWritteUser.replaceAll("\\p{Punct}","");
		return (textWritteUser.equals(""))? null : textWritteUser;
	}
}