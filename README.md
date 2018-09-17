[![Published on Vaadin  Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/tb-tools)
[![Stars on vaadin.com/directory](https://img.shields.io/vaadin-directory/star/tb-tools.svg)](https://vaadin.com/directory/component/tb-tools)

# tb-tools - helpers for integration testing Vaadin apps

A helper that automatically generates somewhat sane identifiers for components to help integration testing using real or simulated browsers. This includes tools like Vaadin TestBench, plain WebDriver, Gatling and JMeter.

The add-on works by doing inspection with reflection for given classes and assigns field names as identifiers for each component that don't contain explicit identifier. This way you for example have sane identifiers for all your fields in e.g. an entity editor ui component and this makes creating integration tests, and possibly also theme building, much easier. 

Note, that as the component uses runtime inspection to do the "magic", it is not suggested to be kept active for application with really high scalability needs.

A simple use case can be seen in the projects tests, but you can also check out these example projects:

 * [tb-page-object](https://github.com/mstahv/tb-page-object/) - an example how to utilize Page Object pattern cleanly with this helper and Vaadin TestBench
 * [tb-drone-exampe](https://github.com/mstahv/vaadinized-tomee-jee6-app-stub/tree/arquillian-tb-tests) - an example that combines two cool WedDriver/Selenium extensions: Arquillian Drone and Vaadin TestBench

