package idea.importer.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class IdeaProjectImportWizardPage extends WizardPage {

	protected IdeaProjectImportWizardPage() {
		super("Intellij Idea Projects");
		setTitle("Import Intellij Idea Projects");
		setDescription("Select Idea projects");
	}

	@Override
	public void createControl(Composite parent) {
		Composite  container = new Composite(parent, SWT.NONE);
		setControl(container);
	}

}
