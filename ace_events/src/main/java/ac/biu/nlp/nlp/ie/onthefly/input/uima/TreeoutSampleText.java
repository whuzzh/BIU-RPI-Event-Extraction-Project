

/* First created by JCasGen Sat Aug 16 17:46:46 IDT 2014 */
package ac.biu.nlp.nlp.ie.onthefly.input.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Aug 25 18:56:30 IDT 2014
 * XML source: C:/Java/Git/breep/ace_events/src/main/resources/desc/OdieInputTypes.xml
 * @generated */
public class TreeoutSampleText extends Treeout {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TreeoutSampleText.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TreeoutSampleText() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TreeoutSampleText(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TreeoutSampleText(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TreeoutSampleText(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
}

    