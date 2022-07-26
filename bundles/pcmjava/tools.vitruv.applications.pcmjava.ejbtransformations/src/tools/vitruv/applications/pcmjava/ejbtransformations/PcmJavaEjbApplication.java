package tools.vitruv.applications.pcmjava.ejbtransformations;

import java.util.HashSet;
import java.util.Set;

import tools.vitruv.applications.pcmjava.ejbtransformations.java2pcm.EjbJava2PcmChangePropagationSpecification;
import tools.vitruv.applications.pcmjava.ejbtransformations.pcm2java.Pcm2EjbJavaChangePropagationSpecification;
import tools.vitruv.framework.applications.VitruvApplication;
import tools.vitruv.change.propagation.ChangePropagationSpecification;

public class PcmJavaEjbApplication implements VitruvApplication {

	@Override
	public Set<ChangePropagationSpecification> getChangePropagationSpecifications() {
		Set<ChangePropagationSpecification> specs = new HashSet<ChangePropagationSpecification>();
		specs.add(new EjbJava2PcmChangePropagationSpecification());
		specs.add(new Pcm2EjbJavaChangePropagationSpecification());
		return specs;
	}

	@Override
	public String getName() {
		return "PCM <> Java EJB";
	}

}
