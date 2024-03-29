package dad.javafx.bindings.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyLongWrapper;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MuebleFX {

	private StringProperty modelo = new SimpleStringProperty();
	private StringProperty fabricante = new SimpleStringProperty();
	private StringProperty hechoMano = new SimpleStringProperty();
	private ObjectProperty<LocalDate> fechaFabricacion = new SimpleObjectProperty<LocalDate>();
	private ObjectProperty<TipoMueble> tipo = new SimpleObjectProperty<TipoMueble>();
	private ReadOnlyLongWrapper antiguedad = new ReadOnlyLongWrapper();
	
	public MuebleFX() {
		fechaFabricacion.addListener((o, ov, nv) -> {
			antiguedad.set(nv.until(LocalDate.now(), ChronoUnit.YEARS));
		});
	}

	public final StringProperty modeloProperty() {
		return this.modelo;
	}
	

	public final String getModelo() {
		return this.modeloProperty().get();
	}
	

	public final void setModelo(final String modelo) {
		this.modeloProperty().set(modelo);
	}
	

	public final StringProperty fabricanteProperty() {
		return this.fabricante;
	}
	

	public final String getFabricante() {
		return this.fabricanteProperty().get();
	}
	

	public final void setFabricante(final String fabricante) {
		this.fabricanteProperty().set(fabricante);
	}
	

	public final StringProperty hechoManoProperty() {
		return this.hechoMano;
	}
	

	public final String getHechoMano() {
		return this.hechoManoProperty().get();
	}
	

	public final void setHechoMano(final String hechoMano) {
		this.hechoManoProperty().set(hechoMano);
	}
	

	public final ObjectProperty<LocalDate> fechaFabricacionProperty() {
		return this.fechaFabricacion;
	}
	

	public final LocalDate getFechaFabricacion() {
		return this.fechaFabricacionProperty().get();
	}
	

	public final void setFechaFabricacion(final LocalDate fechaFabricacion) {
		this.fechaFabricacionProperty().set(fechaFabricacion);
	}
	

	public final ObjectProperty<TipoMueble> tipoProperty() {
		return this.tipo;
	}
	

	public final TipoMueble getTipo() {
		return this.tipoProperty().get();
	}
	

	public final void setTipo(final TipoMueble tipo) {
		this.tipoProperty().set(tipo);
	}
	

	public final javafx.beans.property.ReadOnlyLongProperty antiguedadProperty() {
		return this.antiguedad.getReadOnlyProperty();
	}
	

	public final long getAntiguedad() {
		return this.antiguedadProperty().get();
	}	
	
}
