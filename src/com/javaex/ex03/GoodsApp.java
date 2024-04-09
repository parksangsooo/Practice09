package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
        List<Goods> goodslst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("상품을 입력해 주세요.(종료 q)");

       try {
           while (true) {
               System.out.print("> ");
               String line = sc.nextLine();
               if ("q".equals(line)) {
                   System.out.println("[입력완료]");
                   System.out.println("========================");
                   break;
               }
               String[] data = line.split(",");
               if (data.length == 3) { // 입력받은 정보값 분할해서 집어 넣기
                   String name = data[0];
                   int price = Integer.parseInt(data[1]);
                   int count = Integer.parseInt(data[2]);
                   // Goods 객체 생성 및 리스트에 추가
                   goodslst.add(new Goods(name, price, count));
               } else {
                   System.out.println("상품 정보를 정확하게 입력해 주세요. (형태 : 상품명, 가격, 개수)");
               }
           }
       } catch (Exception e) {
           System.out.println("알 수 없는 오류가 발생했습니다." + e.getMessage());
       } finally {
           sc.close();
       }

       goodslst.stream()
               .map(Goods::toString)
               .forEach(System.out::println);

       int totalCount = goodslst.stream()
               .mapToInt(Goods::getCount)
               .sum();
        System.out.println("모든 상품의 갯수는 " + totalCount + "개 입니다.");
    }
}
