package myVcsArdVP.project.design;

import org.eclipse.emf.ecore.EObject;

/**
 * The services class used by VSM.
 */

public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }

	/**
	* See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
	*/
	public EObject testClass(org.eclipse.emf.ecore.EObject self) {
	   // TODO Auto-generated code

		if(self instanceof VcuSystem.Component) {
			VcuSystem.Component component = (VcuSystem.Component) self;
			System.out.println("This is " + component.getComponentName() + " component");
		}
		
		return self;
	}
	
	
}
