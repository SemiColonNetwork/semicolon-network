package com.semicolonAfrica.SemiColonNetwork.service;

public class Template {

    public static String mailTemplate(String firstName){

        return "<div id=\"email\" style=\"width:600px;margin: auto;background:white;\">\n" +
                "  <table role=\"presentation\" border=\"0\" align=\"right\" cellspacing=\"0\">\n" +
                "    <tr>\n" +
                "      <td>\n" +
                "        <a href=\"#\" style=\"font-size: 9px; text-transform:uppercase; letter-spacing: 1px; color: #99ACC2;  font-family:Arial;\">View in Browser</a>\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </table>\n" +
                "   \n" +
                "  <!-- Header --> \n" +
                "  <table role=\"presentation\" border=\"0\" width=\"100%\" cellspacing=\"0\">\n" +
                "  <tr>\n" +
                "    <td bgcolor=\"#00A4BD\" align=\"center\" style=\"color: white;\">\n" +
                "     <h1 style=\"font-size: 52px; margin:0 0 20px 0; font-family:Arial;\">Semi-Colon Network!</h1>\n" +
                "    </tr>\n" +
                "      </td>\n" +
                "  </table>" +
                " <!-- Body 1 --> \n" +
                "  <table role=\"presentation\" border=\"0\" width=\"100%\" cellspacing=\"0\">\n" +
                "     <tr>\n" +
                "       <td style=\"padding: 30px 30px 30px 60px;\">\n" +
                "        <h3 style=\"font-size: 28px; margin:0 0 20px 0; font-family:Arial;\">Hello " + firstName + "</h3>\n" +
                "        <p>Thank you for Joining!</p>\n" +
                "        <p></p>\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </table>\n" +
                "  \n" +
                " <!-- Footer -->\n" +
                "  <table role=\"presentation\" border=\"0\" width=\"100%\" cellspacing=\"0\">\n" +
                "      <tr>\n" +
                "          <td bgcolor=\"#F5F8FA\" style=\"padding: 30px 30px;\">\n" +
                "          </td>\n" +
                "      </tr>\n" +
                "  </table> \n" +
                "</div>";

    }
}
