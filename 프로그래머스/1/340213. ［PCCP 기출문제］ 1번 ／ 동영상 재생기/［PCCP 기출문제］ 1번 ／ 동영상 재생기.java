class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        String[] vl = video_len.split(":");
        String[] ps = pos.split(":");
        String[] os = op_start.split(":");
        String[] oe = op_end.split(":");
        
        int[] ivl = new int[2];
        int[] ips = new int[2];
        int[] ios = new int[2];
        int[] ioe = new int[2];
        
        for (int i = 0; i < 2; i++) {
            ivl[i] = Integer.parseInt(vl[i]);
            ips[i] = Integer.parseInt(ps[i]);
            ios[i] = Integer.parseInt(os[i]);
            ioe[i] = Integer.parseInt(oe[i]);
        }
        
        if (ips[0] * 60 + ips[1] >= ios[0] * 60 + ios[1] && ips[0] * 60 + ips[1] < ioe[0] * 60 + ioe[1]) {
            ips[0] = ioe[0];
            ips[1] = ioe[1];
        }
        
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("next")) {
                ips[1] += 10;
                
                if (ips[1] >= 60) {
                    ips[1] -= 60;
                    ips[0] += 1;
                }
                
                if (ips[0] * 60 + ips[1] >= ivl[0] * 60 + ivl[1]) {
                    ips[0] = ivl[0];
                    ips[1] = ivl[1];
                }
            }
            
            if (commands[i].equals("prev")) {
                ips[1] -= 10;
                
                if (ips[1] < 0) {
                    ips[1] += 60;
                    ips[0] -= 1;
                }
                
                if (ips[0] == -1) {
                    ips[0] = 0;
                    ips[1] = 0;
                }
            }
            
            if (ips[0] * 60 + ips[1] >= ios[0] * 60 + ios[1] && ips[0] * 60 + ips[1] < ioe[0] * 60 + ioe[1]){
               ips[0] = ioe[0];
               ips[1] = ioe[1];
            }
        }
        
        if (ips[0] * 60 + ips[1] >= ivl[0] * 60 + ivl[1]) {
            return video_len;
        }
        
        
        if (ips[0] < 10 && ips[1] < 10) {
            answer = "0" + ips[0] + ":" + "0" + ips[1];
        } else if (ips[0] < 10 && ips[1] >= 10) {
            answer = "0" + ips[0] + ":" + ips[1];
        } else if (ips[0] >= 10 && ips[1] < 10) {
            answer = "" + ips[0] + ":" + "0" + ips[1];
        } else {
            answer = "" + ips[0] + ":" + ips[1];
        }
            
        return answer;
    }
}