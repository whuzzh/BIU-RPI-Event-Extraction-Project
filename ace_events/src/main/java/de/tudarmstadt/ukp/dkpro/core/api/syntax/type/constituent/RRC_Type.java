
/* First created by JCasGen Tue Mar 11 18:07:45 IST 2014 */
package de.tudarmstadt.ukp.dkpro.core.api.syntax.type.constituent;

import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

/** 
 * Updated by JCasGen Tue Mar 11 18:07:45 IST 2014
 * @generated */
public class RRC_Type extends Constituent_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (RRC_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = RRC_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new RRC(addr, RRC_Type.this);
  			   RRC_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new RRC(addr, RRC_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = RRC.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.tudarmstadt.ukp.dkpro.core.api.syntax.type.constituent.RRC");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public RRC_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    