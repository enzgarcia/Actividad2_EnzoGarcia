package ar.edu.udeci.pv;

import org.apache.commons.cli.*;

public class CommandLineApp {
    public static void main(String[] args) {
        Options options = new Options();

        Option input = new Option("i", "input", true, "ruta del archivo de entrada");
        input.setRequired(true);
        options.addOption(input);

        Option output = new Option("o", "output", true, "ruta del archivo de salida");
        options.addOption(output);

        Option verbose = new Option("v", "verbose", false, "imprimir información detallada");
        options.addOption(verbose);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("Actividad2_EnzoGarcia", options);
            System.exit(1);
            return;
        }

        String inputFile = cmd.getOptionValue("input");
        String outputFile = cmd.getOptionValue("output");
        boolean isVerbose = cmd.hasOption("verbose");

        System.out.println("Archivo de entrada: " + inputFile);
        if (outputFile != null) {
            System.out.println("Archivo de salida: " + outputFile);
        }
        if (isVerbose) {
            System.out.println("Modo detallado activado.");
        }
    }
}
