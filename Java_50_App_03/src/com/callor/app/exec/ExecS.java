package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class ExecS {

	  public static void main(String[] args) {

		  List<Integer> 대영소수 = new ArrayList<>();
		      List<Integer> 소수x소수 = new ArrayList<>();

		      int count = 1;
		      // 1. '대영소수'리스트에 2 3 5 7 로 나눠지지 않는 수를 100개 저장
		      do {
		        count++;
		        if (count%2!=0 && count%3!=0 && count%5!=0 && count%7!=0){
		          대영소수.add(count);
		        }
		      } while(대영소수.size() < 100);

		      //1. 에서 찾은 소수 리스트를 하나씩 가져와서 반복시킴.
		        for (Integer integer : 대영소수) {
		          // 어차피 1 2 3은 인수에서 제외 되었기 때문에 비교는 소수의 1/3까지의 수 가져와서 나누기를 시도한다.
		          int maxCount = Math.round(integer/3);
		          for(int countNum=2; countNum<= maxCount; countNum++){

		            System.out.println("나누기 시도 넘버 : "+ countNum +" 대영 예상 소수 : " + integer);

		            //'대영소수' 이외의 감지되는 소수는 소수*소수 이므로 따로 리스트를 작성한다.
		            if (integer % countNum == 0 && countNum != integer && !소수x소수.contains(integer)) {
		              소수x소수.add(integer);
		            }
		          }
		        }

		      //'대영소수'리스트에서 소수＊소수 의 결과값을 제외한다.
		      for (Integer integer : 소수x소수) {
		        대영소수.remove(대영소수.indexOf(integer));
		      }

		      System.out.println("======제외한 값======");
		      for (Integer integer : 소수x소수) {
		        System.out.println(integer);
		      }

		        System.out.println("======결과======");
		      for (Integer integer : 대영소수) {
		        System.out.println(integer);
		      }

		    }
		  }
