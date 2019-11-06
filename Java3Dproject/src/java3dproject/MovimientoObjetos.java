/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3dproject;

/**
 *
 * @author Juan Rivera
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;
import javax.vecmath.*;
import com.sun.j3d.utils.geometry.Sphere;
import javax.swing.Timer;


public class MovimientoObjetos extends Applet implements ActionListener, KeyListener{
    //se crean los atributos
    private Button go = new Button("Go");
    private TransformGroup objTrans;
    private Transform3D trans = new Transform3D();
    private float height=0.0f;
    private float sign = 1.0f; 
    private Timer timer;
    private float xloc=0.0f;
    public MovimientoObjetos(){
        setLayout(new BorderLayout());
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        //se configura el canvas
        Canvas3D c = new Canvas3D(config);
        //se posicion el canvas en el centro
        add("Center", c);
        
        c.addKeyListener(this);
        timer = new Timer(100,this);
        //se crea el panel con el boton Go que generará la acción
        Panel p =new Panel();
        p.add(go);
        //Se agrega el panel a la parte superior
        add("North",p);
        //se agrega la acción 
        go.addActionListener(this);
        go.addKeyListener(this);
      //Se crea ra rama grupo
        BranchGroup scene = createSceneGraph();
        //Se crea el universo
        SimpleUniverse u = new SimpleUniverse(c);
        u.getViewingPlatform().setNominalViewingTransform();
        u.addBranchGraph(scene);
    }
    
    
    public BranchGroup createSceneGraph() {
        BranchGroup objRoot = new BranchGroup();

        // Se crea una esfera
        Sphere sphere = new Sphere(0.25f);
        //Se crea el objeto transformacion
        objTrans = new TransformGroup();
        //se agrega la opcion de transformar
        objTrans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        //se crea la transforacion 3D
        Transform3D pos1 = new Transform3D();
        //se establece el vector sobre el cual se realizará el movimiento
        pos1.setTranslation(new Vector3f(0.0f,0.0f,0.0f));
        //Se agrega el vector sobre el que se realiza el movimiento a la transformacion
        objTrans.setTransform(pos1);
        //se agrega la esfera sobre el objeto transformacion
        objTrans.addChild(sphere);
        //se agrega la transformacion al grupo
        objRoot.addChild(objTrans);
        BoundingSphere bounds = new BoundingSphere(new Point3d(0.0,0.0,0.0), 100.0);
        Color3f light1Color = new Color3f(1.0f, 0.0f, 0.2f);
        Vector3f light1Direction = new Vector3f(4.0f, -7.0f, -12.0f);
        DirectionalLight light1= new DirectionalLight(light1Color, light1Direction);
        light1.setInfluencingBounds(bounds);
        objRoot.addChild(light1);
        // Set up the ambient light
        Color3f ambientColor = new Color3f(1.0f, 1.0f, 1.0f);
        AmbientLight ambientLightNode = new AmbientLight(ambientColor);
        ambientLightNode.setInfluencingBounds(bounds);
        objRoot.addChild(ambientLightNode);
        return objRoot;
    }
    //genera movimientos laterales al oprimir las teclas A y S
    public void keyPressed(KeyEvent e) {
     
        if (e.getKeyChar()=='s') {xloc = xloc + .1f;}
        if (e.getKeyChar()=='a') {xloc = xloc - .1f;}
     }

    public void keyReleased(KeyEvent e){

       // Invoked when a key has been released.

    }

    public void keyTyped(KeyEvent e){

       //Invoked when a key has been typed.

    }

    public void actionPerformed(ActionEvent e ) {
       // inicia el conteo del timer
       if (e.getSource()==go){
          if (!timer.isRunning()) {
             timer.start();
          }
       }
       else {
           //realiza variaciones en la altura
           height += .1 * sign;
          if (Math.abs(height *2) >= 1 ) sign = -1.0f * sign;
          if (height<-0.4f) {
              //cambia la posicion de la esfera
          trans.setScale(new Vector3d(1.0, .8, 1.0));
       }
       else {
          trans.setScale(new Vector3d(1.0, 1.0, 1.0));
       }
          //realiza traslaciones horizontales
       trans.setTranslation(new Vector3f(xloc,height,0.0f));
       //aplica la transformacion
       objTrans.setTransform(trans);
       }
    }
    
}
