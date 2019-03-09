package cn.lansky;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

/**
 * @author onlyo
 * @since 2019/3/9 18:51
 */
@Mojo(name = "sky", defaultPhase = LifecyclePhase.PACKAGE)
public class MvnPluginTest extends AbstractMojo {
    @Parameter
    private String txt;

    @Parameter
    private List<String> list;

    @Parameter(property = "args")
    private String args;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("输出输出:::+++" + txt);
        System.out.println("输出输出:::+++" + list);
        System.out.println("输出:::+++" + args);
    }

}
