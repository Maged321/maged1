
package acount;

/**
 *
 * @author HP
 */
public class TV {
    int channal;
    int voulmelevel;
    boolean on;
    public TV(){
    channal=1;
    voulmelevel=3;
    on=false;
    }
    public void turnoff(){
    on=false;
    }
    public void turnon(){
    on=true;
    }
    public void setchannal(int chanl){
    if(on&&chanl>=1&&chanl<=120)
        channal=chanl;
    }
    public void setvoulme(int voulm){
    if(on&&voulm>=1&&voulm<=7)
        voulmelevel=voulm;
    }
    public void cup(){
    if(on&&channal<120)
        channal++;
    }
    public void cdown(){
    if(on&&channal>1)
        channal--;
    }
    public void vup(){
    if(on&&channal<7)
        channal++;
    }
    public void vdown(){
    if(on&&channal>1)
        channal--;
    }
}
