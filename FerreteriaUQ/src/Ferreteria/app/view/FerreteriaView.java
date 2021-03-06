package Ferreteria.app.view;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class FerreteriaView extends ApplicationWindow {

	/**
	 * Create the application window.
	 */
	public FerreteriaView() {
		super(null);
		createActions();
		addToolBar(SWT.FLAT | SWT.WRAP);
		addMenuBar();
		addStatusLine();
	}

	/**
	 * Create contents of the application window.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		TabFolder tabFolder = new TabFolder(container, SWT.NONE);
		tabFolder.setBounds(10, 0, 956, 633);

		TabItem tbtmEmpleado = new TabItem(tabFolder, SWT.NONE);
		tbtmEmpleado.setText("Empleado");
		
		EmpleadoView empleadoViewComposite = new EmpleadoView(tabFolder, SWT.NONE);
		tbtmEmpleado.setControl(empleadoViewComposite);
		
		TabItem tbtmProducto = new TabItem(tabFolder, SWT.NONE);
		tbtmProducto.setText("Producto");
		
		ProductoView productoViewComposite = new ProductoView(tabFolder, SWT.NONE);
		tbtmProducto.setControl(productoViewComposite);
		
		/*TabItem tbtmProveedor = new TabItem(tabFolder, SWT.NONE);
		tbtmProveedor.setText("Proveedor");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmProveedor.setControl(composite_1);*/

		return container;
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			FerreteriaView window = new FerreteriaView();
			window.setBlockOnOpen(true);
			window.open();
			Display.getCurrent().dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Configure the shell.
	 * 
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Ferreteria app");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(998, 731);
	}
}
