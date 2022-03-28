pipeline 'source-code-sync', {
  projectName = 'Default'

  formalParameter 'ec_stagesToRun', {
    expansionDeferred = '1'
  }

  stage 'Stage 1', {
    colorCode = '#289ce1'
    pipelineName = 'source-code-sync'
    gate 'PRE', {
      }

    gate 'POST', {
      }

    task 'run_pipeline', {
      actualParameter = [
        'config_name': '/projects/Default/pluginConfigurations/gcp-jenkins',
        'jenkins_depend_on_build_result': '0',
        'jenkins_enable_parallel_mode': '0',
        'job_name': 'flow-pipeline',
        'need_to_run_report': '1',
        'parameters': '',
      ]
      subpluginKey = 'EC-Jenkins'
      subprocedure = 'RunAndWait'
      taskType = 'PLUGIN'
    }

    task 'pipeline_status', {
      actualParameter = [
        'build_number': '',
        'config_name': '/projects/Default/pluginConfigurations/gcp-jenkins',
        'job_name': 'flow-pipeline',
        'result_outpp': '',
        'wait_for_build': '1',
      ]
      subpluginKey = 'EC-Jenkins'
      subprocedure = 'GetBuildStatus'
      taskType = 'PLUGIN'
    }
  }

  // Custom properties

  property 'ec_counters', {

    // Custom properties
    pipelineCounter = '1'
  }
}