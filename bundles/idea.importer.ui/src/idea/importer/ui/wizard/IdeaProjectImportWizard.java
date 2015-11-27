package idea.importer.ui.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

public class IdeaProjectImportWizard extends Wizard implements IImportWizard {

	public IdeaProjectImportWizard() {
		
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void addPages() {
		addPage(new IdeaProjectImportWizardPage());
	}

}
