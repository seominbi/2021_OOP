abstract class PairMap{
    protected String keyArray[];    //key 저장
    protected String valueArray[];  //value 저장
    abstract String get(String key);    //key값 가진 value리턴, 없으면 null
    abstract void put(String key, String value);    //key와value저장, 기존에 key있으면 value를 수정
    abstract String delete(String key); //key값 가진 아이템 삭제& value값 리턴
    abstract int length();  //현재 저장된아이테 ㅁ개수
}
class Dictionary extends PairMap{
    public Dictionary(int n){
        keyArray=new String[n];
        valueArray=new String[n];
    }
    String get(String key){
        for(int i=0;i< keyArray.length;i++){
            if(key.equals(keyArray[i])){
                return valueArray[i];
            }
        }
        return null;
    }

    void put(String key, String value){
        //중복된 key가 있으면 value값 수정
        int i;
        for(i=0;i< keyArray.length;i++){
            if(key.equals(keyArray[i])){
                valueArray[i]=value;
                break;
            }
        }
        //중복된 key가 없으면 null자리(배열 중 빈 인덱스)에 정보 입력
        if(i==keyArray.length) {
            for (int j = 0; j < keyArray.length; j++) {
                if (keyArray[j]==null) {
                    keyArray[j] = key;
                    valueArray[j] = value;
                    break;
                }
            }
        }
    }
    String delete(String key){
        for(int i=0;i< keyArray.length;i++){
            if(key.equals(keyArray[i])){
                String s = valueArray[i];
                keyArray[i]=null;
                valueArray[i]=null;
                return s;
            }
        }
        return null;
    }

    int length(){
        int cnt=0;
        for(int i=0;i<keyArray.length;i++){
            if(keyArray[i]!=null){
                ++cnt;
            }
        }
        return cnt;
    }
}
public class OOP5_10 {
    public static void main(String[] args) {
        Dictionary dic=new Dictionary(10);
        dic.put("황기태","자바");
        dic.put("이재문","파이썬");
        dic.put("이재문","C++");
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 "+dic.get("황기태"));
    }
}