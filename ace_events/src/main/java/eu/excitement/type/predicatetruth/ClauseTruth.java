

/* First created by JCasGen Tue Mar 11 18:07:46 IST 2014 */
package eu.excitement.type.predicatetruth;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Aug 04 21:24:55 IDT 2014
 * XML source: C:/Java/Git/breep/ace_events/TypeSystem.xml
 * @generated */
public class ClauseTruth extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ClauseTruth.class);
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
  protected ClauseTruth() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ClauseTruth(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ClauseTruth(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ClauseTruth(JCas jcas, int begin, int end) {
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
     
 
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets This represents the value of the annotation.
   * @generated */
  public String getValue() {
    if (ClauseTruth_Type.featOkTst && ((ClauseTruth_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "eu.excitement.type.predicatetruth.ClauseTruth");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ClauseTruth_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets This represents the value of the annotation. 
   * @generated */
  public void setValue(String v) {
    if (ClauseTruth_Type.featOkTst && ((ClauseTruth_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "eu.excitement.type.predicatetruth.ClauseTruth");
    jcasType.ll_cas.ll_setStringValue(addr, ((ClauseTruth_Type)jcasType).casFeatCode_value, v);}    
  }

    