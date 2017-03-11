/*******************************************************************************
 * Copyright (c) 2012-2017 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.providers;

/**
 * Mojo for generation implementation of DynaProvider interface.
 *
 * @author Evgen Vidolob
 */
//@Mojo(name = "generate", requiresDependencyResolution = ResolutionScope.COMPILE)
public enum DynaProviderMojo1 //extends AbstractMojo
{
//    @Parameter(property = "outputDir", required = true)
//    private String outputDirectory;
//
//    @Parameter(property = "typeName", defaultValue = "org.eclipse.che.providers.DynaProviderImpl")
//    private String typeName;
//
//    @Parameter(property = "project.compileClasspathElements", required = true, readonly = true)
//    private List<String> classpath;
//
//    @Override
//    public void execute() throws MojoExecutionException, MojoFailureException {
//        File outFile = new File(outputDirectory, typeName.replace('.', File.separatorChar) + ".java");
//        String packageName = typeName.substring(0, typeName.lastIndexOf('.'));
//        String className = typeName.substring(typeName.lastIndexOf('.') + 1, typeName.length());
//
//        DynaProviderGenerator generator = new DynaProviderGenerator(packageName, className, classpath);
//
//
//        try {
//            Files.createDirectories(outFile.toPath().getParent());
//        } catch (IOException e) {
//            throw new MojoExecutionException("Can't create packages folders", e);
//        }
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
//            writer.write(generator.generate());
//        } catch (IOException e) {
//            throw new MojoExecutionException("Can't write file content", e);
//        }
//}
}