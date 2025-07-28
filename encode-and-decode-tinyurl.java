public class Codec {
    HashMap<String, String> codeDB = new HashMap<>(), urlDB = new HashMap<>();
    static final String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String getCode(){
        char[] codes = new char[6];
        for(int i = 0; i < 6; i++){
            codes[i] = chars.charAt((int)Math.random()*62);
        }return "http://tinyurl.com/" + String.valueOf(codes);
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(urlDB.containsKey(longUrl)) return longUrl;
        String code = getCode();
        while(codeDB.containsKey(code)) code = getCode();
        codeDB.put(code, longUrl);
        urlDB.put(longUrl, code);
        return code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return codeDB.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));