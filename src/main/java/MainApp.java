import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;

public class MainApp extends SimpleApplication {
    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.start();
    }
    @Override
    public void simpleInitApp() {
        Box box = new Box(1,1,1);
        Geometry geometry  = new Geometry("box",box);
        Spatial spatial = assetManager.loadModel("Models/cone.j3o");
        //Spatial spatial = assetManager.loadModel("Models/cone.obj");
       // geometry.setMaterial(new Material(assetManager,"Common/MatDefs/Misc/Unshaded.j3md"));
     /*   Material mat = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md");  // create a simple material
        mat.setColor("Color", ColorRGBA.Blue);
        spatial.setMaterial(mat);*/
        rootNode.attachChild(spatial);
       DirectionalLight sun = new DirectionalLight();
        sun.setDirection((new Vector3f(-0.5f, -0.5f, -0.5f)));
        sun.setColor(ColorRGBA.Cyan);
        rootNode.addLight(sun);

    }
}
