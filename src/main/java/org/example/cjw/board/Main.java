package org.example.cjw.board;

import java.util.Scanner;

/**
 * 명령) /usr/article/write
 * == 게시물 등록 ==
 * 제목 : ~~~~~~ -> 실제로 입력받을 수 있도록
 * 내용 : ~~~~
 * 1번 게시물이 등록되었습니다.
 * 명령)
 * */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("자바 게시판 시작");

    while (true) {
      System.out.print("명령) ");
      String cmd = sc.nextLine();

      if(cmd.equals("/usr/article/write")) {
        System.out.println("== 게시물 등록 ==");

        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("내용 : ");
        String contents = sc.nextLine();
        System.out.println("1번 게시물이 등록되었습니다.");
        
      } else if(cmd.equals("exit")) {
        break;
      } else {
        System.out.println("올바른 명령어가 아닙니다.");
      }
    }

    System.out.println("프로그램 끝");
    sc.close();
    System.out.println("자바 게시판 끝");
  }
}