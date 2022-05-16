/**
 * 문제 설명
 * 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한 사항
 * 1. nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
 * 2. nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
 */

package programmers;

public class 소수만들기 {

    public int solution(int[] nums) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for( int i=0; i < nums.length-2; i++){
            for( int j=i+1; j < nums.length-1; j++){
                for( int k=j+1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isSosu(sum))
                        answer++;
                }
            }
        }

        return answer;
    }

    public boolean isSosu(int num){
        for( int n=2; n < num; n++){
            if(num % n == 0)
                return false;
        }
        return true;
    }

}
