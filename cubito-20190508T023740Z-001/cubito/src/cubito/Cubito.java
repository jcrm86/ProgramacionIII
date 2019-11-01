
package cubito;

import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3d;

public class Cubito {
SimpleUniverse universo= new SimpleUniverse(); // creacion del universo
BranchGroup grupo=new BranchGroup();// donde van todas las figuras que se generen
ColorCube cubo= new ColorCube(0.3);// figura el parametro de entrada es el tamaño
ColorCube cubo1= new ColorCube(0.2);
TransformGroup GT=new TransformGroup();// ssirve para realizar transformaciones y modificaciones a la figura
TransformGroup GT1=new TransformGroup();
Transform3D transformar= new Transform3D(); // cambios de posicion y orientacion de la figura
Transform3D transformar1= new Transform3D();
double y=0;
public Cubito(){
     GT.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
     GT1.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
     GT.setTransform(transformar);
    GT.addChild(cubo);
    GT1.addChild(cubo1);
    grupo.addChild(GT);
    grupo.addChild(GT1);
    universo.getViewingPlatform().setNominalViewingTransform();// mejor visualizacion del universo
    universo.addBranchGraph(grupo);
    transformar.rotX(100);
    GT.setTransform(transformar);
    GT.getTransform(transformar);
    transformar1.set(new Vector3d(0.9,0,0));
    GT1.setTransform(transformar1);
}
public static void main(String[] args) {
 new Cubito();
    }
    
}
