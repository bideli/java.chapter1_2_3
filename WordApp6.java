import javax.swing.*;

public class WordApp {
    public static void main(String[] args){
        String word= JOptionPane.showInputDialog("Enter 4 words and put * between them:");
        int inex1=word.indexOf("*");
        String word1=word.substring(0,inex1);
        int inex2=word.indexOf("*",inex1+1);
        String word2=word.substring(inex1+1,inex2);
        int inex3=word.indexOf("*",inex2+1);
        String word3=word.substring(inex2+1,inex3);
        String word4=word.substring(inex3+1);
        String inverse=word4+"*"+word3+"*"+word2+"*"+word1;
        JOptionPane.showMessageDialog(null,word+"\n"+inverse);
    }
}
