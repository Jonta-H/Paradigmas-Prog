package ClinicaMedica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Classe de Associação
public class Consulta {
    private LocalDateTime data;
    private float valorConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(LocalDateTime data, Paciente paciente, Medico medico, float valorConsulta) {
        this.data = data;
        this.paciente = paciente;
        this.medico = medico;
        this.valorConsulta = valorConsulta;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public float getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(float valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Consulta{" +
                "data=" + data.format(formatoBR) +
                ", valorConsulta=" + valorConsulta +
                ", \n\tmedico=" + medico +
                ", \n\tpaciente=" + paciente +
                '}';
    }
}
