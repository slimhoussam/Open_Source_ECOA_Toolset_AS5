/*
 * Copyright 2017, BAE Systems Limited.
 *  
 * This software and its outputs are not claimed to be fit or safe for any purpose. Any user should
 * satisfy themselves that this software or its outputs are appropriate for its intended purpose.
*/
package tech.ecoa.osets.eclipse.plugin.editors.parts.assmbl.edpart;

import java.util.List;
import java.util.Observable;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;

import tech.ecoa.osets.eclipse.plugin.editors.parts.assmbl.figure.ComponentFigure;
import tech.ecoa.osets.eclipse.plugin.editors.parts.assmbl.figure.CompositeFigure;
import tech.ecoa.osets.eclipse.plugin.editors.parts.assmbl.model.ComponentNode;
import tech.ecoa.osets.eclipse.plugin.editors.parts.assmbl.policy.ComponentNodeEditPolicy;
import tech.ecoa.osets.eclipse.plugin.editors.parts.assmbl.policy.ComponentNodeLayoutPolicy;

@SuppressWarnings("rawtypes")
public class ComponentEditPart extends AppAbstractEditPart {

	public ComponentEditPart(ComponentNode node, String containerName) {
		super();
		node.addObserver(this);
		node.setContainerName(containerName);
		setModel(node);
	}

	@Override
	protected IFigure createFigure() {
		ComponentNode model = (ComponentNode) getModel();
		ComponentFigure figure = new ComponentFigure();
		figure.setNode(model);
		figure.rebuildFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new ComponentNodeLayoutPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentNodeEditPolicy());
	}

	@Override
	protected void refreshVisuals() {
		ComponentNode model = (ComponentNode) getModel();
		ComponentFigure figure = (ComponentFigure) getFigure();
		figure.setNode(model);
		try {
			CompositeEditPart parent = (CompositeEditPart) getParent();
			CompositeFigure pFigure = (CompositeFigure) parent.getFigure();
			pFigure.setConstraint(figure, model.getConstraints());
		} catch (Exception e) {
		}
		figure.rebuildFigure();
	}

	@Override
	protected List getModelChildren() {
		return ((ComponentNode) getModel()).getChild();
	}

	@Override
	public void update(Observable o, Object arg) {
		refresh();
	}
}