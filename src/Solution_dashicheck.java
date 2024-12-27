class Solution_dashicheck {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count0 = 0;
        int adariCounter =0;
        int adariMax;
        int rank = 0;
        int rankMax = 0;


        // 로또에 0 몇개인지
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i]==0) {
                count0++;
            }
        }

        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[j] == win_nums[i]) {
                    adariCounter++;
                }
            }
        }
        adariMax = adariCounter+count0;

        switch (adariCounter) {
            case 2 :
                rank = 5;
                break;
            case 3 :
                rank = 4;
                break;
            case 4 :
                rank = 3;
                break;
            case 5 :
                rank = 2;
                break;
            case 6 :
                rank = 1;
                break;
            default:
                rank = 6;
        }

        switch (adariMax) {
            case 2 :
                rankMax = 5;
                break;
            case 3 :
                rankMax = 4;
                break;
            case 4 :
                rankMax = 3;
                break;
            case 5 :
                rankMax = 2;
                break;
            case 6 :
                rankMax = 1;
                break;
            default:
                rankMax = 6;
        }
        int[] answer = {rankMax, rank};
        return answer;
    }
}