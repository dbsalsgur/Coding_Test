package level0;

public class Test {

	public static void main(String[] args) {
		String[] spell = {"p", "o", "s"};
		String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
		
		int answer = 0;
        String[] key = new String[spell.length];
        for (int i = 0; i < spell.length; i++) {
        	key[i] = i+"";
		}
        
        System.out.println(key);
        for (int i = 0; i < dic.length; i++) {
        	for (int j = 0; j < spell.length; j++) {
				dic[i] = dic[i].replaceAll(spell[j], j+"");
			}
        	System.out.println(i+"="+dic[i]);
        	for (int j = 0; j < key.length; j++) {
        		if (dic[i].contains(key[j])) {
        			answer = 1;
        		} else {
        			answer = 2;
        		}
			}
		}
        
        System.out.println(answer);
	}
}

