/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.eduard.degiro.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 *
 * @author ecatala
 */
public enum Log {

    MANAGER,
    WIRE,
    WEB_API,
    TECDOC,
    SERVIDOR,
    API,
    SEGURETAT,
    CONSULTA_ARTICULOS,
    IDENTIFICACION,
    ESTADISTICA,
    CONNECTOR;

    private final Logger logger;

    private Log() {
        this.logger = LogManager.getLogger(name());
    }

    public void debug(Object message) {
        logger.debug(message);
    }

    public void debug(Object message, Throwable t) {
        logger.debug(message, t);
    }

    public void error(Object message) {
        logger.error(message);
    }

    public void error(Object message, Throwable t) {
        logger.error(message, t);
    }

    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    public void warn(Object message) {
        logger.warn(message);
    }

    public void warn(Object message, Throwable t) {
        logger.warn(message, t);
    }
    
    public void info(Object message) {
        logger.info(message);
    }

    public void info(Object message, Throwable t) {
        logger.info(message, t);
    }

    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    public void fatal(Object message) {
        logger.fatal(message);
    }

    public void fatal(Object message, Throwable t) {
        logger.fatal(message, t);
    }

    public boolean isFatalEnabled() {
        return logger.isFatalEnabled();
    }

    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    public void trace(Object message) {
        logger.trace(message);
    }

    public void trace(Object message, Throwable t) {
        logger.trace(message, t);
    }

    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

}
