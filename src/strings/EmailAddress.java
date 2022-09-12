package strings;

import java.util.HashSet;
import java.util.Set;

public class EmailAddress {

    // Email addresses are made up of local and domain names. For example in kevin@dailybyte.com,
    // kevin is the local name and dailybye.com is the domain name. Email addresses may also contain '+' or '.'
    // characters besides lowercase letters. If there is a '.' in the local name of the email address it is ignored.
    // Everything after a '+' in the local name is also ignored.
    // For example ke.vin+abc@dailybyte.com is equivalent to kevin@dailybyte.com
    // Given a list of email addresses, find the number of unique addresses.
    public static void main(String[] args){
        System.out.println(countUniqueEmails(new String[]{
                "test.email+kevin@dailybyte.com",
                "test.e.mail+john.smith@dailybyte.com",
                "testemail+david@daily.byte.com"
        })); // 2
        // "testemail@dailybyte.com" and "testemail@daily.byte.com"
        // are unique since the first two email addresses in the list are equivalent.
    }

    // Runtime: O(N) where N is the number of email addresses in addresses.
    // Space complexity: O(N).
    public static int countUniqueEmails(String[] emails){

        Set<String> uniqueEmails = new HashSet<>();

        for(String email : emails){

            int i = email.indexOf('@');
            String local = email.substring(0, i);
            String domain = email.substring(i);
            if(local.contains("+")){
                local = email.substring(0, local.indexOf('+'));
            }

            local = local.replaceAll("\\.", "");
            uniqueEmails.add(local + domain);
        }

        return uniqueEmails.size();
    }
}
