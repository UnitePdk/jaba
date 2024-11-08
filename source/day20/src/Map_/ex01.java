package Map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ex01 {
    public static void main(String[] args) {
        HashMap<String, String> members = new HashMap<>(); // <Key, Value>
        members.put("user01", "사용자01");
        members.put("user02", "사용자02");
        members.put("user03", "사용자03");

        Set<Map.Entry<String,String>> entries=members.entrySet();
        for(Map.Entry<String, String> entry:entries) {
            String key = entry.getKey();
            String value= entry.getValue();
            System.out.printf("%s %s%n",key, value);

        }

        System.out.println(members);

        members.put("user02","(수정)사용자02");

        System.out.println(members);

        members.remove("user02");

        System.out.println(members);

        String userNm=members.getOrDefault("user02", "없음"); // 찾아보고 없으면 디폴트값
        System.out.println(userNm);
    }
}
