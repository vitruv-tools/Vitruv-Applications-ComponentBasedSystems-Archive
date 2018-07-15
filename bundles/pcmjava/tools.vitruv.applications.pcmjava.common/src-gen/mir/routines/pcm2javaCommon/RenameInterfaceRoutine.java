package mir.routines.pcm2javaCommon;

import com.google.common.base.Objects;
import java.io.IOException;
import mir.routines.pcm2javaCommon.RoutinesFacade;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.Repository;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RenameInterfaceRoutine extends AbstractRepairRoutineRealization {
  private RenameInterfaceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public boolean getCorrespondingModelElementsPreconditionContractsPackage(final OperationInterface interf, final org.emftext.language.java.containers.Package contractsPackage) {
      String _name = contractsPackage.getName();
      boolean _equals = Objects.equal(_name, "contracts");
      return _equals;
    }
    
    public EObject getCorrepondenceSourceContractsPackage(final OperationInterface interf) {
      Repository _repository__Interface = interf.getRepository__Interface();
      return _repository__Interface;
    }
    
    public void callRoutine1(final OperationInterface interf, final org.emftext.language.java.containers.Package contractsPackage, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.renameJavaClassifier(interf, contractsPackage, interf.getEntityName());
    }
  }
  
  public RenameInterfaceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final OperationInterface interf) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.RenameInterfaceRoutine.ActionUserExecution(getExecutionState(), this);
    this.interf = interf;
  }
  
  private OperationInterface interf;
  
  protected boolean executeRoutine() throws IOException {
    getLogger().debug("Called routine RenameInterfaceRoutine with input:");
    getLogger().debug("   interf: " + this.interf);
    
    org.emftext.language.java.containers.Package contractsPackage = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceContractsPackage(interf), // correspondence source supplier
    	org.emftext.language.java.containers.Package.class,
    	(org.emftext.language.java.containers.Package _element) -> userExecution.getCorrespondingModelElementsPreconditionContractsPackage(interf, _element), // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (contractsPackage == null) {
    	return false;
    }
    registerObjectUnderModification(contractsPackage);
    userExecution.callRoutine1(interf, contractsPackage, this.getRoutinesFacade());
    
    postprocessElements();
    
    return true;
  }
}
