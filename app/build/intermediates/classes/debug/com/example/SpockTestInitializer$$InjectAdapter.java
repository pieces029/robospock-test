// Code generated by dagger-compiler.  Do not edit.
package com.example;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binding<SpockTestInitializer>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code SpockTestInitializer} and its
 * dependencies.
 *
 * Being a {@code Provider<SpockTestInitializer>} and handling creation and
 * preparation of object instances.
 */
public final class SpockTestInitializer$$InjectAdapter extends Binding<SpockTestInitializer>
    implements Provider<SpockTestInitializer> {
  private Binding<android.app.Application> application;

  public SpockTestInitializer$$InjectAdapter() {
    super("com.example.SpockTestInitializer", "members/com.example.SpockTestInitializer", NOT_SINGLETON, SpockTestInitializer.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    application = (Binding<android.app.Application>) linker.requestBinding("android.app.Application", SpockTestInitializer.class, getClass().getClassLoader());
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    getBindings.add(application);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<SpockTestInitializer>}.
   */
  @Override
  public SpockTestInitializer get() {
    SpockTestInitializer result = new SpockTestInitializer(application.get());
    return result;
  }

}