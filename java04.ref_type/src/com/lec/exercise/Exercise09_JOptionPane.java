package com.lec.exercise;

import javax.swing.JOptionPane;

public class Exercise09_JOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	    8. Exercise09.java : 	
//	    키보드로부터 학생 수와 각 학생들의 점수를 입력받아서 최고 점수 및 평균 점수를 구하기
//	    (참고: Scanner의 nextlnt() 메소드이용)
//
//		System.out.println("---------------------------------------------");
//		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
//		System.out.println("---------------------------------------------");
//		System.out.print("선택> ");	
//		
//		JOptionPan.showInputDialog() 이용해도 상관없음
		
		boolean run = true;
        int num = 0;
        int[] score = {};
        
        while (run) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.학생수입력 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택 => ");

            String input = JOptionPane.showInputDialog(null, "선택 => ");

            int selectNo = Integer.parseInt(input);
            
            switch (selectNo) {
            
            case 1:
                String numInput = JOptionPane.showInputDialog(null, "학생수 => ");
                num = Integer.parseInt(numInput);
                score = new int[num];
                break;

            case 2:
                for (int i = 0; i < score.length; i++) {
                    String scoreInput = JOptionPane.showInputDialog(null, "학생 " + (i + 1) + " 점수입력 => ");
                    score[i] = Integer.parseInt(scoreInput);
                }
                break;

            case 3:
                for (int i = 0; i < score.length; i++) {
                    JOptionPane.showMessageDialog(null, "학생" + (i + 1) + " 점수 = " + score[i]);
                }
                break;

            case 4:
                int max = 0;
                int sum = 0;
                double avg = 0.0;

                for (int i = 0; i < score.length; i++) {
                    max = (max < score[i]) ? score[i] : max;
                    sum += score[i];
                }
                avg = (double) (sum / num);
                JOptionPane.showMessageDialog(null, "최고 점수 = " + max + "\n평균 점수 = " + avg);
                break;

            default:
                run = false;

            }

        }
        JOptionPane.showMessageDialog(null, "종료");

	}

}










