package org.example.cjw.board;

import java.util.Scanner;

/**
 * 명령) /usr/article/write
 * == 게시물 등록 ==
 * 제목 : ~~~~~~ -> 실제로 입력받을 수 있도록
 * 내용 : ~~~~
 * 1번 게시물이 등록되었습니다.
 * 명령) /usr/article/write
 * == 게시물 등록 ==
 * 제목 : ~~~~~~ -> 실제로 입력받을 수 있도록
 * 내용 : ~~~~
 * 2번 게시물이 등록되었습니다.
 * */
/**
 * Article class 도입
 * 인스턴스 변수로 id, title, content
 *
 * 게시물 생성시 입력받은 새 게시물 정보를 새 Article 객체에 넣기
 * */
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("자바 게시판 시작");
    int articleLastId = 0;

    while (true) {
      System.out.print("명령) ");
      String cmd = sc.nextLine();

      if(cmd.equals("/usr/article/write")) {
        Article article = new Article();
        System.out.println("== 게시물 등록 ==");

        System.out.print("제목 : ");
        String title = sc.nextLine();
        article.title = title;
        System.out.print("내용 : ");
        String content = sc.nextLine();
        article.content = content;
        int id = ++articleLastId;
        article.id = id;
        article.post();
        System.out.printf("%d번 게시물이 등록되었습니다.\n", id);
      } else if(cmd.equals("exit")) {
        System.out.println("프로그램 끝");
        break;
      } else {
        System.out.println("올바른 명령어가 아닙니다.");
      }
    }
    sc.close();
    System.out.println("자바 게시판 끝");
  }
}

class Article {
  int id;
  String title;
  String content;

  void post() {
    System.out.printf("%d번 제목: %s, 내용: %s을 게시하다.\n", this.id, this.title, this.content );
  }
}