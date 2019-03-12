package StringProblems.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author XP
 * @date 2018/11/4 13:31
 */
public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Map<String, String> map = new HashMap<>();
        for (String email : emails) {
            String[] names = email.split("@");
            String localName = names[0];
            String domainName = names[1];
            String uniqueLocalName = localName.split("\\+")[0].replace(".","");
            String uniqueName = uniqueLocalName + domainName;
            map.put(uniqueName,"");
        }
        return map.size();
    }
}
