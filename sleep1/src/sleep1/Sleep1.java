/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleep1;

/**
 *
 * @author Prakhar
 */
class sleep extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } 
            catch (Exception e){
                System.out.println(e);
                
            }
            System.out.println(i);
        }
    }
}
public class Sleep1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sleep t1 = new sleep();
        sleep t2 = new sleep();
        t1.start();
        t2.start();
    }
    
}
