package com.semicolonAfrica.SemiColonNetwork.service;

public class Template {

    public static String mailTemplate(String firstName){

        return "<div id=\"email\" style=\"width:600px;margin: auto;background:white;\">\n" +
                "   \n" +
                "  <!-- Header --> \n" +
                "  <table role=\"presentation\" border=\"0\" width=\"100%\" cellspacing=\"0\">\n" +
                "  <tr>\n" +
                "    <td bgcolor=\"#red\" align=\"center\" style=\"color: white;\">\n" +
                "     <h1 style=\"font-size: 30px; margin:0 0 20px 0; font-family:Arial;\">Semicolon Network</h1>\n" +
                "    </tr>\n" +
                "      </td>\n" +
                "  </table>" +
                " <!-- Body 1 --> \n" +
                "  <table role=\"presentation\" border=\"0\" width=\"100%\" cellspacing=\"0\">\n" +
                "     <tr>\n" +
                "       <td style=\"padding: 30px 30px 30px 60px;\">\n" +
                "        <h2 style=\"font-size: 20px; margin:0 0 20px 0; font-family:Arial;\">Hi " + firstName + "</h2>\n" +
                "\n" +
                "Welcome Onboard!<br>\n" + // Line break after the sentence
                "Thank you for choosing to join us on this project we would get back to you with more details later.<br>\n" + 
                "\n" +
                "\n" +
                "\n" +
                "If you have any questions, feel free to reach out anytime.<br>\n" + 
                "\n" +
                "\n" +
                "Warm regards,<br>\n" + 
                "\n" +
                "\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </table>\n" +
                "  \n" +
                " <!-- Footer -->\n" +
                "  <table role=\"presentation\" border=\"0\" width=\"100%\" cellspacing=\"0\">\n" +
                "      <tr>\n" +
                "          <td bgcolor=\"#F5F8FA\" style=\"padding: 30px 30px;\">\n" +
                "            <p style=\"margin:0 0 12px 0; font-size:16px; line-height:24px; color: #99ACC2; font-family:Arial\"> Made with &hearts;</p>\n" +
                "          </td>\n" +
                "      </tr>\n" +
                "  </table> \n" +
                "</div>";
    }
}
