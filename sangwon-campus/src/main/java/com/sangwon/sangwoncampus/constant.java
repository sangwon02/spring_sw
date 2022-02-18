package com.sangwon.sangwoncampus;

public class constant {
    static final int MAX = 100;
    //왠만하면 main안쪽이 아닌 바깥쪽으로 상수 선언한다.
    public static void main(String[] args) {
        //만약 여기에 MAX = 150;하면 에러가 난다.
        System.out.println("최댓값:" + MAX);
    }
}
