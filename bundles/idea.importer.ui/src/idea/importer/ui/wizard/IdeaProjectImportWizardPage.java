package idea.importer.ui.wizard;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;

public class IdeaProjectImportWizardPage extends WizardPage {
	
	protected Combo rootDirectoryCombo;

	protected IdeaProjectImportWizardPage() {
		super("Intellij Idea Projects");
		setTitle("Import Intellij Idea Projects");
		setDescription("Select Idea projects");
	}

	@Override
	public void createControl(Composite parent) {
	    Composite composite = new Composite(parent, SWT.NONE);
	    composite.setLayout(new GridLayout(3, false));
	    setControl(composite);

	      final Label selectRootDirectoryLabel = new Label(composite, SWT.NONE);
	      selectRootDirectoryLabel.setLayoutData(new GridData());
	      selectRootDirectoryLabel.setText("Location:");

	      rootDirectoryCombo = new Combo(composite, SWT.NONE);
	      rootDirectoryCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	      rootDirectoryCombo.setFocus();

	      final Button browseButton = new Button(composite, SWT.NONE);
	      browseButton.setText("Browse...");
	      browseButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
	      browseButton.addSelectionListener(new SelectionAdapter() {
	        public void widgetSelected(SelectionEvent e) {
	          DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.NONE);
	          dialog.setText("Select folder:");
	          String path = rootDirectoryCombo.getText();
	          if(path.length() == 0) {
	            path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toPortableString();
	          }
	          dialog.setFilterPath(path);

	          String result = dialog.open();
	          if(result != null) {
	            rootDirectoryCombo.setText(result);
//	            if(rootDirectoryChanged()) {
//	              scanProjects();
//	            }
	          }
	        }
	      });
	}

}
