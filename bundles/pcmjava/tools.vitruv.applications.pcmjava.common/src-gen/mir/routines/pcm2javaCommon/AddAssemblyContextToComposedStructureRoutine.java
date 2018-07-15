package mir.routines.pcm2javaCommon;

import java.io.IOException;
import mir.routines.pcm2javaCommon.RoutinesFacade;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.imports.ClassifierImport;
import org.emftext.language.java.instantiations.NewConstructorCall;
import org.emftext.language.java.members.Constructor;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.Member;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.ComposedStructure;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.domains.java.util.JavaModificationUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddAssemblyContextToComposedStructureRoutine extends AbstractRepairRoutineRealization {
  private AddAssemblyContextToComposedStructureRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement10(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall, final ClassifierImport contextClassImport, final Constructor constructor) {
      return assemblyContext;
    }
    
    public EObject getCorrepondenceSourceEncapsulatedComponentJavaClass(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass) {
      RepositoryComponent _encapsulatedComponent__AssemblyContext = assemblyContext.getEncapsulatedComponent__AssemblyContext();
      return _encapsulatedComponent__AssemblyContext;
    }
    
    public void update0Element(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall, final ClassifierImport contextClassImport, final Constructor constructor) {
      EList<Member> _members = compositeComponentJavaClass.getMembers();
      _members.add(assemblyContextField);
      JavaModificationUtil.addConstructorToClass(constructor, compositeComponentJavaClass);
      JavaModificationUtil.addImportToCompilationUnitOfClassifier(contextClassImport, compositeComponentJavaClass, encapsulatedComponentJavaClass);
    }
    
    public EObject getElement8(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall, final ClassifierImport contextClassImport, final Constructor constructor) {
      return assemblyContext;
    }
    
    public EObject getElement9(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall, final ClassifierImport contextClassImport, final Constructor constructor) {
      return constructor;
    }
    
    public EObject getElement6(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall, final ClassifierImport contextClassImport, final Constructor constructor) {
      return assemblyContext;
    }
    
    public EObject getElement7(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall, final ClassifierImport contextClassImport, final Constructor constructor) {
      return contextClassImport;
    }
    
    public void update1Element(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall, final ClassifierImport contextClassImport, final Constructor constructor) {
      JavaModificationUtil.createNewForFieldInConstructor(newConstructorCall, constructor, assemblyContextField);
    }
    
    public EObject getElement1(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall, final ClassifierImport contextClassImport, final Constructor constructor) {
      return compositeComponentJavaClass;
    }
    
    public EObject getCorrepondenceSourceCompositeComponentJavaClass(final ComposedStructure composedStructure, final AssemblyContext assemblyContext) {
      return composedStructure;
    }
    
    public EObject getElement4(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall, final ClassifierImport contextClassImport, final Constructor constructor) {
      return assemblyContext;
    }
    
    public EObject getElement5(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall, final ClassifierImport contextClassImport, final Constructor constructor) {
      return newConstructorCall;
    }
    
    public EObject getElement2(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall, final ClassifierImport contextClassImport, final Constructor constructor) {
      return constructor;
    }
    
    public void updateAssemblyContextFieldElement(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField) {
      final TypeReference typeRef = JavaModificationUtil.createNamespaceClassifierReference(encapsulatedComponentJavaClass);
      JavaModificationUtil.createPrivateField(assemblyContextField, typeRef, assemblyContext.getEntityName());
    }
    
    public EObject getElement3(final ComposedStructure composedStructure, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall, final ClassifierImport contextClassImport, final Constructor constructor) {
      return assemblyContextField;
    }
  }
  
  public AddAssemblyContextToComposedStructureRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ComposedStructure composedStructure, final AssemblyContext assemblyContext) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.AddAssemblyContextToComposedStructureRoutine.ActionUserExecution(getExecutionState(), this);
    this.composedStructure = composedStructure;this.assemblyContext = assemblyContext;
  }
  
  private ComposedStructure composedStructure;
  
  private AssemblyContext assemblyContext;
  
  protected boolean executeRoutine() throws IOException {
    getLogger().debug("Called routine AddAssemblyContextToComposedStructureRoutine with input:");
    getLogger().debug("   composedStructure: " + this.composedStructure);
    getLogger().debug("   assemblyContext: " + this.assemblyContext);
    
    org.emftext.language.java.classifiers.Class compositeComponentJavaClass = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceCompositeComponentJavaClass(composedStructure, assemblyContext), // correspondence source supplier
    	org.emftext.language.java.classifiers.Class.class,
    	(org.emftext.language.java.classifiers.Class _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (compositeComponentJavaClass == null) {
    	return false;
    }
    registerObjectUnderModification(compositeComponentJavaClass);
    org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceEncapsulatedComponentJavaClass(composedStructure, assemblyContext, compositeComponentJavaClass), // correspondence source supplier
    	org.emftext.language.java.classifiers.Class.class,
    	(org.emftext.language.java.classifiers.Class _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (encapsulatedComponentJavaClass == null) {
    	return false;
    }
    registerObjectUnderModification(encapsulatedComponentJavaClass);
    org.emftext.language.java.members.Field assemblyContextField = org.emftext.language.java.members.impl.MembersFactoryImpl.eINSTANCE.createField();
    notifyObjectCreated(assemblyContextField);
    userExecution.updateAssemblyContextFieldElement(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField);
    
    org.emftext.language.java.instantiations.NewConstructorCall newConstructorCall = org.emftext.language.java.instantiations.impl.InstantiationsFactoryImpl.eINSTANCE.createNewConstructorCall();
    notifyObjectCreated(newConstructorCall);
    
    org.emftext.language.java.imports.ClassifierImport contextClassImport = org.emftext.language.java.imports.impl.ImportsFactoryImpl.eINSTANCE.createClassifierImport();
    notifyObjectCreated(contextClassImport);
    
    org.emftext.language.java.members.Constructor constructor = org.emftext.language.java.members.impl.MembersFactoryImpl.eINSTANCE.createConstructor();
    notifyObjectCreated(constructor);
    
    // val updatedElement userExecution.getElement1(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField, newConstructorCall, contextClassImport, constructor);
    userExecution.update0Element(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField, newConstructorCall, contextClassImport, constructor);
    
    // val updatedElement userExecution.getElement2(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField, newConstructorCall, contextClassImport, constructor);
    userExecution.update1Element(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField, newConstructorCall, contextClassImport, constructor);
    
    addCorrespondenceBetween(userExecution.getElement3(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField, newConstructorCall, contextClassImport, constructor), userExecution.getElement4(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField, newConstructorCall, contextClassImport, constructor), "");
    
    addCorrespondenceBetween(userExecution.getElement5(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField, newConstructorCall, contextClassImport, constructor), userExecution.getElement6(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField, newConstructorCall, contextClassImport, constructor), "");
    
    addCorrespondenceBetween(userExecution.getElement7(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField, newConstructorCall, contextClassImport, constructor), userExecution.getElement8(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField, newConstructorCall, contextClassImport, constructor), "");
    
    addCorrespondenceBetween(userExecution.getElement9(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField, newConstructorCall, contextClassImport, constructor), userExecution.getElement10(composedStructure, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField, newConstructorCall, contextClassImport, constructor), "");
    
    postprocessElements();
    
    return true;
  }
}
